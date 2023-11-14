import { IRoleEntity } from "../../../domain/entities/IRoleEntity";

export interface CreateUserDTO {
    username: string;
    email: string;
    password: string;
    role: IRoleEntity;
}