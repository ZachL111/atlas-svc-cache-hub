fun main() {
    val signalcase_1 = Signal(80, 96, 17, 17, 10)
    check(Policy.score(signalcase_1) == 133)
    check(Policy.classify(signalcase_1) == "review")
    val signalcase_2 = Signal(90, 73, 17, 25, 9)
    check(Policy.score(signalcase_2) == 71)
    check(Policy.classify(signalcase_2) == "review")
    val signalcase_3 = Signal(89, 79, 15, 24, 13)
    check(Policy.score(signalcase_3) == 98)
    check(Policy.classify(signalcase_3) == "review")
    val domainReview = DomainReview(74, 38, 18, 79)
    check(DomainReviewLens.score(domainReview) == 211)
    check(DomainReviewLens.lane(domainReview) == "ship")
}
