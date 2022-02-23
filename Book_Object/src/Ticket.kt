class Ticket(var fee: Long) {
}

class Bag(
    private var amount: Long = 0,
    private var invitation: Invitation? = null,
    var ticket: Ticket? = null,
) {
    constructor(amount: Long) : this(amount, null, null)

    constructor(invitation: Invitation, amount: Long) : this(amount, invitation)

    fun hasInvitation(): Boolean {
        return invitation != null
    }

    fun hashTicket(): Boolean {
        return ticket != null
    }

    fun plusAmount(amount: Long) {
        this.amount += amount
    }

    fun minusAmount(amount: Long) {
        this.amount -= amount
    }
}

