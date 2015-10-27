package org.swtk.commons.dict.wordnet.index.name.instance.d.a.m.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceDAMO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"damocles\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10941323\"]}");
	add("{\"term\":\"damoiselle\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10008706\"]}");
	add("{\"term\":\"damon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10941631\"]}");
	add("{\"term\":\"damosel\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10008706\"]}");
	add("{\"term\":\"damourite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14697830\"]}");
	add("{\"term\":\"damozel\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10008706\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }