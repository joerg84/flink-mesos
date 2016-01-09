package org.apache.flink.mesos;

public class FlinkFramework {
	public static void main(String[] args) throws Exception {
		if (args.length < 1 || args.length > 3) {
			usage();
			System.exit(1);
		}
	}

	private static void usage() {
		System.err.println("Usage: flink-mesos" + " master <tasks> <url>");
	}
}
