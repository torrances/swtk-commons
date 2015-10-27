package org.swtk.commons.dict.wordnet.index.name.instance.l.i.m.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceLIMI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"limicolae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02025152\"]}");
	add("{\"term\":\"limit\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"13780436\", \"13780696\", \"08610212\", \"08610686\", \"15293814\", \"05131322\"]}");
	add("{\"term\":\"limitation\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"00809843\", \"15249089\", \"13780436\", \"05169982\", \"05854882\"]}");
	add("{\"term\":\"limited\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03311330\"]}");
	add("{\"term\":\"limiter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03675212\"]}");
	add("{\"term\":\"limiting\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13823013\"]}");
	add("{\"term\":\"limitlessness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05216592\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }