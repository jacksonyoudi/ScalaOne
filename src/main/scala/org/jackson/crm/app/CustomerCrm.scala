package org.jackson.crm.app

import org.jackson.crm.view._

object CustomerCrm {
  def main(args: Array[String]): Unit = {
    new CustomerView().mainMenu()
  }
}
