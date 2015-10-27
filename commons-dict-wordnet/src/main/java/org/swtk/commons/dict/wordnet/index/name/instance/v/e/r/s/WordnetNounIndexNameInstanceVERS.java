package org.swtk.commons.dict.wordnet.index.name.instance.v.e.r.s;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceVERS {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"versace\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11384130\"]}");
	add("{\"term\":\"versailles\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04536781\", \"08958392\"]}");
	add("{\"term\":\"versant\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09384414\"]}");
	add("{\"term\":\"versatility\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05649679\"]}");
	add("{\"term\":\"verse\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"06396351\", \"06393492\", \"07107220\"]}");
	add("{\"term\":\"versed\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03767380\"]}");
	add("{\"term\":\"versicle\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06396887\"]}");
	add("{\"term\":\"versification\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"07108155\", \"07108269\", \"07108425\"]}");
	add("{\"term\":\"versifier\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10548068\"]}");
	add("{\"term\":\"version\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"01270394\", \"05937299\", \"06548380\", \"06420422\", \"05849159\", \"07188236\"]}");
	add("{\"term\":\"verso\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04092293\", \"06268146\"]}");
	add("{\"term\":\"verst\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13674417\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }