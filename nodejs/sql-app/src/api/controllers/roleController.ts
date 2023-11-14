import { Request, Response, Router } from "express";
import { RoleService } from "../../app/services/roleService";
import { RoleDto } from "../../app/dtos/role/role.dto";
import logger from "../../infrastructure/logger/logger";
import { CreateRoleDto } from "../../app/dtos/role/create.role.dto";

export class RoleController {
  public router: Router;
  private roleService: RoleService;

  constructor(roleService: RoleService) {
    this.roleService = roleService;
    this.router = Router();
    this.routes();
  }

  public async getRoleById(req: Request, res: Response): Promise<void> {
    logger.info("estoy dentro del getRoleById Controller");
    logger.debug("esto es un debug");
    const { id } = req.params;
    const roleDto = await this.roleService.getRoleById(id);

    if (!roleDto) {
      res.status(404).json({ message: "Role not found" });
      return;
    }

    res.json(roleDto);
  }

  public async createRole(req: Request, res: Response): Promise<Response> {
    try {
      const roleDto: CreateRoleDto = req.body;
      const role = await this.roleService.createRole(roleDto);
      return res.status(201).json(role);
    } catch (error) {
      console.log(error);
      return res.status(400).json({ message: error });
    }
  }

  

  public routes() {
    this.router.get("/:id", this.getRoleById.bind(this));
    this.router.post("/", this.createRole.bind(this));
  }
}
