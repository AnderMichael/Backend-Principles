import { Role } from "../models/role";

export interface RoleRepository {
  findById(id: string): Promise<Role | null>;
  createRole(role: Role): Promise<Role>;
  updateRole(id: string): Promise<Role | null>;

}
