package com.abhi

import scala.slick.collection.heterogenous.HNil
import scala.slick.driver.MySQLDriver.simple._

/**
  * Created by ASrivastava on 9/1/17.
  */

case class FooRow(
   a1: Long,
   a2: Option[Long] = None,
   a3: Option[String] = None,
   a4: Option[String] = None,
   a5: Option[String] = None,
   a6: Option[String] = None,
   a7: Option[String] = None,
   a8: Option[String] = None,
   a9: Option[String] = None,
   a10: Option[String] = None,
   a11: Option[String] = None,
   a12: Option[String] = None,
   a13: Option[String] = None,
   a14: Option[String] = None,
   a15: Option[String] = None,
   a16: Option[String] = None,
   a17: Option[String] = None,
   a18: Option[String] = None,
   a19: Option[String] = None,
   a20: Option[String] = None,
   a21: Option[String] = None,
   a22: Option[String] = None,
   a23: Option[String] = None,
   a24: Option[String] = None,
   a25: Option[String] = None,
   a26: Option[Long] = None,
   a27: Option[String]= None,
   a28: Option[String] = None,
   a29: Option[Int] = None,
   a30: Option[String] = None,
   a31: Option[String] = None,
   a32: Option[Int] = None,
   a33: Option[String] = None,
   a34: Option[Long] = None,
   a35: Option[String] = None,
   a36: Option[Long] = None,
   a37: Option[String] = None,
   a38: Option[String] = None,
   a39: Option[String] = None,
   a40: Option[String] = None,
   a41: Option[String] = None,
   a42: Option[Long] = None,
   a43: Option[String] = None
   //a44: Option[String] = None
)


class Foo(_tableTag: Tag) extends Table[FooRow](_tableTag, "foo") {
   def * = (a1 :: a2 :: a3 :: a4 :: a5 :: a6 :: a7 :: a8 :: a9 :: a10 :: a11 :: a12 :: a13 :: a14 :: a15 :: a16 :: a17 :: a18 :: a19 :: a20 :: a21 :: a22 :: a23 :: a24 :: a25 :: a26 :: a27 :: a28 :: a29 :: a30 :: a31 :: a32 :: a33 :: a34 :: a35 :: a36 :: a37 :: a38 :: a39 :: a40 :: a41 :: a42 :: a43 :: HNil).shaped <> ({case x => FooRow(x(0),x(1),x(2),x(3),x(4),x(5),x(6),x(7),x(8),x(9),x(10),x(11),x(12),x(13),x(14),x(15),x(16),x(17),x(18),x(19),x(20),x(21),x(22),x(23),x(24),x(25),x(26),x(27),x(28),x(29),x(30),x(31),x(32),x(33),x(34),x(35),x(36),x(37),x(38),x(39),x(40),x(41),x(42))}, ({ x:FooRow => Option((x.a1 :: x.a2 :: x.a3 :: x.a4 :: x.a5 :: x.a6 :: x.a7 :: x.a8 :: x.a9 :: x.a10 :: x.a11 :: x.a12 :: x.a13 :: x.a14 :: x.a15 :: x.a16 :: x.a17 :: x.a18 :: x.a19 :: x.a20 :: x.a21 :: x.a22 :: x.a23 :: x.a24 :: x.a25 :: x.a26 :: x.a27 :: x.a28 :: x.a29 :: x.a30 :: x.a31 :: x.a32 :: x.a33 :: x.a34 :: x.a35 :: x.a36 :: x.a37 :: x.a38 :: x.a39 :: x.a40 :: x.a41 :: x.a42 :: x.a43 :: HNil))}))
//   def * = (a1 :: a2 :: a3 :: a4 :: a5 :: a6 :: a7 :: a8 :: a9 :: a10 :: a11 :: a12 :: a13 :: a14 :: a15 :: a16 :: a17 :: a18 :: a19 :: a20 :: a21 :: a22 :: a23 :: a24 :: a25 :: a26 :: a27 :: a28 :: a29 :: a30 :: a31 :: a32 :: a33 :: a34 :: a35 :: a36 :: a37 :: a38 :: a39 :: a40 :: a41 :: a42 :: a43 :: a44 :: HNil).shaped <> ({case x => FooRow(x(0),x(1),x(2),x(3),x(4),x(5),x(6),x(7),x(8),x(9),x(10),x(11),x(12),x(13),x(14),x(15),x(16),x(17),x(18),x(19),x(20),x(21),x(22),x(23),x(24),x(25),x(26),x(27),x(28),x(29),x(30),x(31),x(32),x(33),x(34),x(35),x(36),x(37),x(38),x(39),x(40),x(41),x(42),x(43))}, ({ x:FooRow => Option((x.a1 :: x.a2 :: x.a3 :: x.a4 :: x.a5 :: x.a6 :: x.a7 :: x.a8 :: x.a9 :: x.a10 :: x.a11 :: x.a12 :: x.a13 :: x.a14 :: x.a15 :: x.a16 :: x.a17 :: x.a18 :: x.a19 :: x.a20 :: x.a21 :: x.a22 :: x.a23 :: x.a24 :: x.a25 :: x.a26 :: x.a27 :: x.a28 :: x.a29 :: x.a30 :: x.a31 :: x.a32 :: x.a33 :: x.a34 :: x.a35 :: x.a36 :: x.a37 :: x.a38 :: x.a39 :: x.a40 :: x.a41 :: x.a42 :: x.a43 :: a44 :: HNil))}))
   val a1: Column[Long] = column[Long]("a1", O.AutoInc, O.PrimaryKey)
   val a2: Column[Option[Long]] = column[Option[Long]]("a2", O.Default(None))
   val a3: Column[Option[String]] = column[Option[String]]("a3", O.Default(None))
   val a4: Column[Option[String]] = column[Option[String]]("a4", O.Default(None))
   val a5: Column[Option[String]] = column[Option[String]]("a5", O.Default(None))
   val a6: Column[Option[String]] = column[Option[String]]("a6", O.Default(None))
   val a7: Column[Option[String]] = column[Option[String]]("a7", O.Default(None))
   val a8: Column[Option[String]] = column[Option[String]]("a8", O.Default(None))
   val a9: Column[Option[String]] = column[Option[String]]("a9", O.Default(None))
   val a10: Column[Option[String]] = column[Option[String]]("a10", O.Default(None))
   val a11: Column[Option[String]] = column[Option[String]]("a11", O.Default(None))
   val a12: Column[Option[String]] = column[Option[String]]("a12", O.Default(None))
   val a13: Column[Option[String]] = column[Option[String]]("a13", O.Default(None))
   val a14: Column[Option[String]] = column[Option[String]]("a14", O.Default(None))
   val a15: Column[Option[String]] = column[Option[String]]("a15", O.Default(None))
   val a16: Column[Option[String]] = column[Option[String]]("a16", O.Default(None))
   val a17: Column[Option[String]] = column[Option[String]]("a17", O.Default(None))
   val a18: Column[Option[String]] = column[Option[String]]("a18", O.Default(None))
   val a19: Column[Option[String]] = column[Option[String]]("a19", O.Default(None))
   val a20: Column[Option[String]] = column[Option[String]]("a20", O.Default(None))
   val a21: Column[Option[String]] = column[Option[String]]("a21", O.Default(None))
   val a22: Column[Option[String]] = column[Option[String]]("a22", O.Default(None))
   val a23: Column[Option[String]] = column[Option[String]]("a23", O.Default(None))
   val a24: Column[Option[String]] = column[Option[String]]("a24", O.Default(None))
   val a25: Column[Option[String]] = column[Option[String]]("a25", O.Default(None))
   val a26: Column[Option[Long]] = column[Option[Long]]("a26", O.Default(None))
   val a27: Column[Option[String]]  = column[Option[String]]("a27", O.Default(None))
   val a28: Column[Option[String]]  = column[Option[String]]("a28", O.Default(None))
   val a29: Column[Option[Int]]  = column[Option[Int]]("a29", O.Default(None))
   val a30: Column[Option[String]]  = column[Option[String]]("a30", O.Default(None))
   val a31: Column[Option[String]]  = column[Option[String]]("a31", O.Default(None))
   val a32: Column[Option[Int]]  = column[Option[Int]]("a32", O.Default(None))
   val a33: Column[Option[String]]  = column[Option[String]]("a33", O.Default(None))
   val a34: Column[Option[Long]]  = column[Option[Long]]("a34", O.Default(None))
   val a35: Column[Option[String]]  = column[Option[String]]("a35", O.Default(None))
   val a36: Column[Option[Long]] = column[Option[Long]]("a36", O.Default(None))
   val a37: Column[Option[String]] = column[Option[String]]("a37",O.Default(None))
   val a38: Column[Option[String]] = column[Option[String]]("a38",O.Default(None))
   val a39: Column[Option[String]] = column[Option[String]]("a39", O.Default(None))
   val a40: Column[Option[String]] = column[Option[String]]("a40", O.Default(None))
   val a41: Column[Option[String]] = column[Option[String]]("a41", O.Default(None))
   val a42: Column[Option[Long]] = column[Option[Long]]("a42", O.Default(None))
   val a43: Column[Option[String]] = column[Option[String]]("a43", O.Default(None))
//   val a44: Column[Option[String]] = column[Option[String]]("a44", O.Default(None))

   val index1 = index("idx1", a2 :: a3 :: HNil)
   val index2 = index("idx2", a6 :: HNil)
}

object Foo {
   val query = TableQuery[Foo]
}
