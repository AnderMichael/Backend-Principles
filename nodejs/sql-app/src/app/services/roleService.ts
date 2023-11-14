import { IRoleEntity } from "../../domain/entities/IRoleEntity";
import { RoleRepository } from "../../domain/interfaces/roleRepository";
import { Role } from "../../domain/models/role";
import logger from "../../infrastructure/logger/logger";
import { CreateRoleDto } from "../dtos/role/create.role.dto";
import { RoleDto } from "../dtos/role/role.dto";

export class RoleService {
  constructor(private roleRepository: RoleRepository) {}

  async getRoleById(id: string): Promise<RoleDto | null> {
    // log.info
    // log.debug // id
    const role = await this.roleRepository.findById(id);
    // log.debug user

    if (!role) return null;

    const userResponse: RoleDto = {
      id: role.id,
      name: role.name,
      description: role.description,
    };
    // log.info user obtenido exitosamente
    return userResponse;
  }

  async createRole(roleDto: CreateRoleDto): Promise<Role> {
    // info
    try {
      const roleEntity: IRoleEntity = {
        name: roleDto.name,
        description: roleDto.description,
      };
      const newRole = new Role(roleEntity);
      // logger.debug newUser // creating UserEntity
      return this.roleRepository.createRole(newRole);
    } catch (error) {
      logger.error(error);
    }
  }
}
