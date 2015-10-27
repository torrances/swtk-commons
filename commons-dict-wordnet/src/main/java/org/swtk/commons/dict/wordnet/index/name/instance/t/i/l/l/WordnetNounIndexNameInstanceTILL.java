package org.swtk.commons.dict.wordnet.index.name.instance.t.i.l.l;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTILL {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"till\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"02980398\", \"13379064\", \"15099339\"]}");
	add("{\"term\":\"tillage\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00919990\", \"09283813\"]}");
	add("{\"term\":\"tillandsia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12628657\"]}");
	add("{\"term\":\"tiller\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"03151512\", \"04442893\", \"10730654\", \"13185868\"]}");
	add("{\"term\":\"tilletia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13088833\"]}");
	add("{\"term\":\"tilletiaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13088605\"]}");
	add("{\"term\":\"tillich\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11362613\"]}");
	add("{\"term\":\"tilling\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00920634\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }