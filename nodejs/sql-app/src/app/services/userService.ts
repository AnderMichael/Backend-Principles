import { IUserEntity } from "../../domain/entities/IUserEntity";
import { RoleRepository } from "../../domain/interfaces/roleRepository";
import { UserRepository } from "../../domain/interfaces/userRepository";
import { User } from "../../domain/models/user";
import { CreateUserDTO } from "../dtos/user/create.user.dto";
import { UserDto } from "../dtos/user/user.dto";

export class UserService {
  constructor(
    private userRepository: UserRepository,
    private roleRepository: RoleRepository
  ) {}

  async getUserById(id: string): Promise<UserDto | null> {
    // log.info
    // log.debug // id
    const user = await this.userRepository.findById(id);
    // log.debug user

    if (!user) return null;

    const userResponse: UserDto = {
      id: user.id,
      username: user.username,
      email: user.email,
      lastLogin: user.lastLogin,
    };
    // log.info user obtenido exitosamente
    return userResponse;
  }

  async createUser(userDto: CreateUserDTO): Promise<User> {
    // info
    const role = await this.roleRepository.findById(userDto.role.id);

    const userEntity: IUserEntity = {
      username: userDto.username,
      email: userDto.email,
      passwordHash: userDto.password,
      role: userDto.role,
      createdAt: new Date(),
      lastLogin: null,
    };
    const newUser = new User(userEntity);
    // logger.debug newUser // creating UserEntity
    return this.userRepository.createUser(newUser);
  }
}
