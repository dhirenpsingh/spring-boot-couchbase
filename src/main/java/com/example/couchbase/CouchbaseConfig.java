package com.example.couchbase;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.couchbase.config.AbstractCouchbaseConfiguration;
import org.springframework.data.couchbase.repository.config.EnableCouchbaseRepositories;

@Configuration
@EnableCouchbaseRepositories({"com.example.demo"})
public class CouchbaseConfig extends AbstractCouchbaseConfiguration {
	/*
	@Autowired
	private DBProperties dbProp;

	
	 * @Bean(destroyMethod = "disconnect") public Cluster getCouchbaseCluster() {
	 * return Cluster.connect(dbProp.getHostName(), dbProp.getUsername(),
	 * dbProp.getPassword());
	 * 
	 * // Here is an alternative version that enables TLS by configuring the cluster
	 * environment. return Cluster.connect( dbProp.getHostName(),
	 * ClusterOptions.clusterOptions(dbProp.getUsername(), dbProp.getPassword())
	 * .environment(env -> { // Configure cluster environment properties here
	 * env.securityConfig().enableTls(true);
	 * 
	 * // If you're connecting to Capella, the SDK already knows which certificates
	 * to trust. // When using TLS with non-Capella clusters, you must tell the SDK
	 * which certificates to trust. env.securityConfig().trustCertificate(
	 * Paths.get("/path/to/trusted-root-certificate.pem") ); }) );
	 * 
	 * }
	 */

	@Override
	public String getConnectionString() {
		// TODO Auto-generated method stub
		return "couchbase://127.0.0.1";
	}

	@Override
	public String getUserName() {
		// TODO Auto-generated method stub
		return "Administrator";
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return "Administrator";
	}

	@Override
	public String getBucketName() {
		// TODO Auto-generated method stub
		return "test";
	}

	/*
	 * @Bean public Bucket getCouchbaseBucket(Cluster cluster) {
	 * 
	 * // Creates the cluster if it does not exist yet if
	 * (!cluster.buckets().getAllBuckets().containsKey(dbProp.getBucketName())) {
	 * cluster.buckets().createBucket( BucketSettings.create(dbProp.getBucketName())
	 * .bucketType(BucketType.COUCHBASE)
	 * .minimumDurabilityLevel(DurabilityLevel.NONE) .ramQuotaMB(128)); } return
	 * cluster.bucket(dbProp.getBucketName()); }
	 */
}