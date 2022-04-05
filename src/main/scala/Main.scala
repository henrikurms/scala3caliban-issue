import caliban.GraphQL.graphQL
import caliban.RootResolver

object Main {

  def graphql = (bar: Bar2) => graphQL[Any, Bar2, Unit, Unit](RootResolver(bar))
}

case class Foo(s: String, foo: List[Option[(String, String)]])
case class Foo2(foo: Foo)
case class Bar(s: String, foo: Foo2 => String)
case class Bar2(bar: Bar)
