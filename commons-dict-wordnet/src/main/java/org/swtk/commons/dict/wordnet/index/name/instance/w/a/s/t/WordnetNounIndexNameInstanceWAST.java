package org.swtk.commons.dict.wordnet.index.name.instance.w.a.s.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceWAST {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"wastage\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13349295\", \"13595655\"]}");
	add("{\"term\":\"waste\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"01254711\", \"08521615\", \"04902159\", \"00743943\", \"14880414\"]}");
	add("{\"term\":\"wastebasket\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04562986\"]}");
	add("{\"term\":\"wastebin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02750182\"]}");
	add("{\"term\":\"wastefulness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00743943\", \"04902159\"]}");
	add("{\"term\":\"wasteland\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08521615\"]}");
	add("{\"term\":\"waster\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10028370\", \"10789127\"]}");
	add("{\"term\":\"wastewater\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14881172\"]}");
	add("{\"term\":\"wasteweir\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04284172\"]}");
	add("{\"term\":\"wasteyard\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08577564\"]}");
	add("{\"term\":\"wasting\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"14389146\", \"14571697\"]}");
	add("{\"term\":\"wastrel\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10789127\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }