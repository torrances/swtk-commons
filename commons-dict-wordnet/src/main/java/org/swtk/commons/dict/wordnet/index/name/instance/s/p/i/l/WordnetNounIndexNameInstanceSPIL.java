package org.swtk.commons.dict.wordnet.index.name.instance.s.p.i.l;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSPIL {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"spile\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02923032\", \"03942545\"]}");
	add("{\"term\":\"spill\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"00077704\", \"00330445\", \"04284172\", \"15074161\"]}");
	add("{\"term\":\"spillage\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00330445\", \"13785946\"]}");
	add("{\"term\":\"spillane\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11331282\"]}");
	add("{\"term\":\"spiller\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04483135\", \"10606786\"]}");
	add("{\"term\":\"spillikin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03596652\"]}");
	add("{\"term\":\"spillikins\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00486461\"]}");
	add("{\"term\":\"spillover\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11534313\"]}");
	add("{\"term\":\"spillway\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04284172\"]}");
	add("{\"term\":\"spilogale\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02449519\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }