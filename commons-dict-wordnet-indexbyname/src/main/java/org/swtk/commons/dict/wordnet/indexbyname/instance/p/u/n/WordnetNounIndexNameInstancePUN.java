package org.swtk.commons.dict.wordnet.indexbyname.instance.p.u.n;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePUN {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"pun\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06794438\"]}");
	add("{\"term\":\"punch\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04029643\", \"07946794\", \"00135600\"]}");
	add("{\"term\":\"punchayet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08328452\"]}");
	add("{\"term\":\"punchball\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04030356\"]}");
	add("{\"term\":\"punchboard\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04029816\"]}");
	add("{\"term\":\"puncher\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04029643\", \"10512212\", \"09992191\"]}");
	add("{\"term\":\"punctilio\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01207113\", \"06679474\"]}");
	add("{\"term\":\"punctiliousness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04679962\"]}");
	add("{\"term\":\"punctuality\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05054929\"]}");
	add("{\"term\":\"punctuation\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00391006\", \"06854415\", \"07382730\"]}");
	add("{\"term\":\"punctum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05286421\"]}");
	add("{\"term\":\"puncture\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00944804\", \"04030790\", \"07329258\"]}");
	add("{\"term\":\"pundit\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10226506\"]}");
	add("{\"term\":\"pung\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04030970\"]}");
	add("{\"term\":\"pungapung\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11803347\"]}");
	add("{\"term\":\"pungency\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05000012\", \"06789825\"]}");
	add("{\"term\":\"punic\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07002317\"]}");
	add("{\"term\":\"punica\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12365653\"]}");
	add("{\"term\":\"punicaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12365513\"]}");
	add("{\"term\":\"puniness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05114795\", \"05180732\"]}");
	add("{\"term\":\"punishment\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01162829\"]}");
	add("{\"term\":\"punjab\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08923052\"]}");
	add("{\"term\":\"punjabi\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06984279\", \"09695732\"]}");
	add("{\"term\":\"punk\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"07079780\", \"10512479\", \"15126153\", \"15126290\", \"10203700\"]}");
	add("{\"term\":\"punkah\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04031070\"]}");
	add("{\"term\":\"punkey\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02205330\"]}");
	add("{\"term\":\"punkie\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02205330\"]}");
	add("{\"term\":\"punks\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08387432\"]}");
	add("{\"term\":\"punky\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02205330\"]}");
	add("{\"term\":\"punnet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04031256\"]}");
	add("{\"term\":\"punning\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06794438\"]}");
	add("{\"term\":\"punster\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10512678\"]}");
	add("{\"term\":\"punt\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00137804\", \"04031377\", \"13716762\"]}");
	add("{\"term\":\"punter\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"09871284\", \"10512784\", \"10513004\"]}");
	add("{\"term\":\"punting\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00137804\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }