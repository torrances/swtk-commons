package org.swtk.commons.dict.wordnet.indexbyname.instance.b.a.m;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceBAM {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"bam\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07390857\", \"08931499\"]}");
	add("{\"term\":\"bamako\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08988309\"]}");
	add("{\"term\":\"bambino\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10734114\"]}");
	add("{\"term\":\"bamboo\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"12167743\", \"12168056\"]}");
	add("{\"term\":\"bamboo curtain\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05700059\"]}");
	add("{\"term\":\"bamboo fern\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13230706\"]}");
	add("{\"term\":\"bamboo palm\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"12616460\", \"12616909\"]}");
	add("{\"term\":\"bamboo shoot\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07735075\"]}");
	add("{\"term\":\"bambusa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12168216\"]}");
	add("{\"term\":\"bambusa vulgaris\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12168352\"]}");
	add("{\"term\":\"bambuseae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12167548\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }