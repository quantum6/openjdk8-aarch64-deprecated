/*
 * @test /nodynamiccopyright/
 * @bug 8004832
 * @summary Add new doclint package
 * @library ..
 * @build DocLintTester
 * @run main DocLintTester -ref MissingGT.out MissingGT.java
 */

// tidy: Warning: <.*> missing '>' for end of tag

/**
 * <img src="image.gif"
 * <i>  text </i>
 */
public class MissingGT { }
