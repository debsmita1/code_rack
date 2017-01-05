fac = -> (n) do
    (1..n).reduce(:*) || 1
end
        


combination = ->(n) do
    -> (k) do
        fac.(n)/(fac.(k) * fac.(n-k))
    end
end
n = gets.to_i
r = gets.to_i
nCr = combination.(n)
puts nCr.(r)
