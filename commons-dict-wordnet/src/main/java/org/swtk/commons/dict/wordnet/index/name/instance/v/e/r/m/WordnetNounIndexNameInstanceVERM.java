package org.swtk.commons.dict.wordnet.index.name.instance.v.e.r.m;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceVERM {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"vermeer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11383264\"]}");
	add("{\"term\":\"vermicelli\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07716613\"]}");
	add("{\"term\":\"vermicide\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04535649\"]}");
	add("{\"term\":\"vermiculation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04535785\", \"13555976\"]}");
	add("{\"term\":\"vermiculite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15112053\"]}");
	add("{\"term\":\"vermifuge\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04535925\"]}");
	add("{\"term\":\"vermilion\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04972154\"]}");
	add("{\"term\":\"vermin\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01318471\", \"10768174\"]}");
	add("{\"term\":\"vermis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05493811\"]}");
	add("{\"term\":\"vermont\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09170707\"]}");
	add("{\"term\":\"vermonter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09765345\"]}");
	add("{\"term\":\"vermouth\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07915083\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }