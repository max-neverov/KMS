package kms.persistence

/**
 * @author Maxim Neverov
 */
interface KmsStorage {

    fun get(id: String): String?
    fun insert(doc: String)
    fun delete(id: String): Long
    fun update(id: String, doc: String)
}