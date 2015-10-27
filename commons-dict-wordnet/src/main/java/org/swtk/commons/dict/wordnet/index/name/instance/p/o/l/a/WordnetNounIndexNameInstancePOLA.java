package org.swtk.commons.dict.wordnet.index.name.instance.p.o.l.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePOLA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"polack\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09747089\"]}");
	add("{\"term\":\"poland\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09004957\"]}");
	add("{\"term\":\"polanisia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11887539\"]}");
	add("{\"term\":\"polarimeter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03982463\"]}");
	add("{\"term\":\"polaris\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09419587\"]}");
	add("{\"term\":\"polarisation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"11512414\", \"14025594\"]}");
	add("{\"term\":\"polariscope\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03982463\"]}");
	add("{\"term\":\"polarity\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13878771\", \"13878307\"]}");
	add("{\"term\":\"polarization\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"14025594\", \"11512414\"]}");
	add("{\"term\":\"polarography\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00648390\"]}");
	add("{\"term\":\"polaroid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03982626\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }