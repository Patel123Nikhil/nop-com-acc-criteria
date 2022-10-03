
//NopCommerce Acceptance Criteria-Scenario

Feature: Demo Nopcommerce's topmenu acceptance criteria
    As a user, I would like to check acceptance criteria of Nopcommerce topmenu

    Background: User is on given URL
        When    User type URL https;//demo.nopcommerce.com
        And     User click on enter button
        Then    User is on given URL

    Scenario: Verify that user can navigate to Book category
        When  User os on given URL
        And   Click on Book tab on Top menu
        Then  User is navigated to Book category page

    Scenario:  Verify that user can see the Books category with filters and list products
        Given  User is on given URL
        When   Click on Book tab on Top menu
        And    Check filters and List Tab
        Then   Books category page is displayed with filters and tabs

    Scenario:   Varify user can see 'Sort by' filter on Book category page
        Given   User is on book category page
        When    User is on book category page
        And     Check 'Sort by' filter is present
        Then    'Sort by'filter is available on Book category page

    Scenario:   Verify that user can see 'Display' filter on Book category page
        Given   User is on Book category page
        When    User is on Book categroy page
        And     Check 'Display' filter is present
        Then    'Display' filter is availbe on Book categroy page

    Scenario: Verify that user can see 'Grid' tab on Book category page
        Given   User is on Book category page
        When    User is on Book categroy page
        And     Check 'Grid' tab is presnt
        Then    'Grid' tab is available on Book categroy page

    Scenario:   Verify that user can see 'List' tab on Bppk category page
        Given   User is on Book category page
        When    User is on Book categroy page
        And     Check 'List' tab is presnt
        Then    'List' tab is available on Book categroy page

    Scenario:   Verify that user can see 'Name: A to Z' selection is present in 'Sort by' filter
        Given   User is on Book category page
        When    User is on Book categroy page
        And     Click on 'Sort by'filter
        And     Check that 'Name: A to Z' selection is present
        Then    'Name: A to Z' slection is presnt in 'Sort by' filter


    Scenario:   Verify that user can see 'Name: Z to A' selection is present in 'Sort by' filter
        Given   User is on Book category page
        When    User is on Book categroy page
        And     Click on 'Sort by'filter
        And     Check that 'Name: Z to A' selection is present
        Then    'Name: Z to A' slection is presnt in 'Sort by' filter

    Scenario:   Verify that user can see 'Name: A to Z' filter is functionig as expected(Note: Products are filtered in alphabetical order)
        Given   User is on Book category page
        When    User is on Book categroy page
        And     Click on 'Sort by'filter
        And     Check that 'Name: A to Z' filter
        Then    All products are displayed in alphabetical order




