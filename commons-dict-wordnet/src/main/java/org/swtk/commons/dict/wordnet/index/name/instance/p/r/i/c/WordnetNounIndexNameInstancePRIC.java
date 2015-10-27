package org.swtk.commons.dict.wordnet.index.name.instance.p.r.i.c;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePRIC {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"price\", \"synsetCount\":7, \"upperType\":\"NOUN\", \"ids\":[\"11266398\", \"13324781\", \"07181692\", \"05148930\", \"05171334\", \"13324337\", \"05152365\"]}");
	add("{\"term\":\"pricelessness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05148469\"]}");
	add("{\"term\":\"pricing\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05744681\"]}");
	add("{\"term\":\"prick\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"00946605\", \"05534354\", \"13927849\", \"09834593\"]}");
	add("{\"term\":\"pricker\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02892139\", \"13110391\"]}");
	add("{\"term\":\"pricket\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02433394\", \"04008620\"]}");
	add("{\"term\":\"pricking\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00946605\"]}");
	add("{\"term\":\"prickle\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13110391\"]}");
	add("{\"term\":\"prickleback\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01457497\", \"02618272\"]}");
	add("{\"term\":\"prickliness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04956976\"]}");
	add("{\"term\":\"prickling\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05730815\"]}");
	add("{\"term\":\"prickteaser\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09984664\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }