package me.soulyana.daveslist.repositories;

import me.soulyana.daveslist.entities.Room;
import org.springframework.data.repository.CrudRepository;

public interface RoomRepository extends CrudRepository<Room, Long> {
}
