import { RoleEntity } from "../entities/roleEntity";
import { AppDataSource } from "../config/dataSource";
import { Role } from "../../domain/models/role";
import logger from "../logger/logger";
import { RoleRepository } from "../../domain/interfaces/roleRepository";
export class RoleRepositoryImpl implements RoleRepository {
  async findById(id: string): Promise<Role | null> {
    logger.info("Alguna información relevante");
    const roleEntity = await AppDataSource.getRepository(RoleEntity).findOneBy({
      id,
    });
    return roleEntity ? new Role(roleEntity) : null;
  }

  async createRole(role: Role): Promise<Role> {
    // TODO: set user values

    const roleEntity = AppDataSource.getRepository(RoleEntity).create({
      id: role.id,
      name: role.name,
      description: role.description,
    });

    const roleResponse = await AppDataSource.getRepository(RoleEntity).save(
      roleEntity
    );
    return new Role({
      id: roleResponse.id,
      name: roleResponse.name,
      description: roleResponse.description,
    });
  }

  async updateRole(id: string): Promise<Role> {
    throw new Error("Method not implemented.");
  }
}
