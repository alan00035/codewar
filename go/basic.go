package main

import (
	"fmt"
)

func add(x, y int) int {
	return x + y
}

func swap(x, y string) (string, string) {
	return y, x
}

func main() {
	a, b := swap("ni", "hao")
	fmt.Print(b, a)
}
