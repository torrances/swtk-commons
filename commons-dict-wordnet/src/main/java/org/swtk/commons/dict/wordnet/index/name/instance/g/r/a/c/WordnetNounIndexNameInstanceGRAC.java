package org.swtk.commons.dict.wordnet.index.name.instance.g.r.a.c;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceGRAC {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"grace\", \"synsetCount\":8, \"upperType\":\"NOUN\", \"ids\":[\"04847946\", \"07204699\", \"09518513\", \"15142101\", \"04647713\", \"04907534\", \"05010755\", \"14481629\"]}");
	add("{\"term\":\"gracefulness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05010588\"]}");
	add("{\"term\":\"gracelessness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04822855\", \"05011697\"]}");
	add("{\"term\":\"gracie\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10834717\"]}");
	add("{\"term\":\"gracilariid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02295632\"]}");
	add("{\"term\":\"gracilariidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02295502\"]}");
	add("{\"term\":\"gracility\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05010755\"]}");
	add("{\"term\":\"gracillariidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02295502\"]}");
	add("{\"term\":\"graciousness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04848212\", \"04920745\"]}");
	add("{\"term\":\"grackle\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01577031\", \"01580821\"]}");
	add("{\"term\":\"gracula\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01580727\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }