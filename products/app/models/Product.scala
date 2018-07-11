package models

case class Product(ean: Long, name: String, description: String)

object Product{

  var products = Set(
    Product(5010255012345L, "Paperclips Large", "Large Plain Pack of 1.000"),
    Product(5010255012346L, "Giant Paperclips", "Giant Plain 51mm 100"),
    Product(5010255012347L, "Paperclips Giant Plain", "Giant Plain Pack of 10.000"),
    Product(5010255012348L, "No Tear Paperclip", "No Tear Extra Large Pack of 1.000")
  )

  def findAll = products.toList.sortBy(_.ean)

}
