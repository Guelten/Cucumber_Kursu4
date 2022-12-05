#Senaryo
#CitizenShip sayfasina gidiniz.
#Create islemine dogrulayiniz.
#Daha sonra ayni bilgilerle tekrar Create yapilamadigini dogrulayiniz.
#Daha sonra Bilgileri siliniz
#Yukaridaki islemleri parameter yöntemi ile yapiniz.

  Feature: CitizenShip with scenario Outline

    Background:
      Given Naviagate to Campus
      When Enter username and password and click Login button
      Then User should login successfuly
      And Naviagate to CitizenShip page

      @Regression
      Scenario Outline: CitizenShip Create
        When User a CitizenShip name as "<Name>" short name as "<ShortName>"
        Then Success message should be displayed

        When User a CitizenShip name as "<Name>" short name as "<ShortName>"
        Then Already exist message should be displayed

        When User delete the "<Name>"
        Then Success message should be displayed

        Examples:
          | Name  | ShortName |
          | Gulha11  | BalGul11 |
          | Gulha22  | BalGul22 |
          | Gulha33  | BalGul33 |
          | Gulha44  | BalGul44 |

