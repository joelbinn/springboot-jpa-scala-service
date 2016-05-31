import javax.persistence.{Column, Entity, Id}

@Entity
case class Kaka(@Id@Column(name="ID") id: Long, @Column(name = "COLOR") color: String)
