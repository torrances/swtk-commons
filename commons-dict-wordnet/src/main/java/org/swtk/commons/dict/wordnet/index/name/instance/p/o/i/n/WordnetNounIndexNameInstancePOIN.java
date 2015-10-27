package org.swtk.commons.dict.wordnet.index.name.instance.p.o.i.n;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePOIN {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"poinciana\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"12510320\", \"12519244\"]}");
	add("{\"term\":\"poinsettia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12940964\"]}");
	add("{\"term\":\"point\", \"synsetCount\":26, \"upperType\":\"NOUN\", \"ids\":[\"03218529\", \"03981029\", \"03981127\", \"04739307\", \"05078725\", \"06825147\", \"06834918\", \"06856570\", \"13421323\", \"13734391\", \"13852504\", \"03980573\", \"04739165\", \"13817097\", \"06494090\", \"09419340\", \"13631405\", \"13934887\", \"13925175\", \"05992951\", \"15205381\", \"13962925\", \"05825971\", \"06619161\", \"08637636\", \"05874582\"]}");
	add("{\"term\":\"pointedness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04926188\", \"05078725\"]}");
	add("{\"term\":\"pointel\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03460299\"]}");
	add("{\"term\":\"pointer\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"02102649\", \"03155461\", \"03981590\", \"06830979\"]}");
	add("{\"term\":\"pointillism\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03981777\", \"08292974\"]}");
	add("{\"term\":\"pointillist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10467498\"]}");
	add("{\"term\":\"pointlessness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05181550\"]}");
	add("{\"term\":\"pointrel\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03460299\"]}");
	add("{\"term\":\"pointsman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10467896\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }