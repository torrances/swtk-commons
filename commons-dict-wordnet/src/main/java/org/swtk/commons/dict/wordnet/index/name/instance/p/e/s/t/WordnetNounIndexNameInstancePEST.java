package org.swtk.commons.dict.wordnet.index.name.instance.p.e.s.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePEST {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"pest\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"01316879\", \"10439375\", \"14099961\", \"14162173\"]}");
	add("{\"term\":\"pesterer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10439375\"]}");
	add("{\"term\":\"pesthole\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08636825\"]}");
	add("{\"term\":\"pesthouse\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03656129\"]}");
	add("{\"term\":\"pesticide\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15004774\"]}");
	add("{\"term\":\"pestilence\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"05701634\", \"14099961\", \"14162173\"]}");
	add("{\"term\":\"pestis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14162173\"]}");
	add("{\"term\":\"pestle\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03925411\", \"03925552\", \"04307218\"]}");
	add("{\"term\":\"pesto\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07848392\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }