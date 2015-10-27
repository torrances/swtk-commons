package org.swtk.commons.dict.wordnet.index.name.instance.m.o.l.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceMOLE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"mole\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"01892161\", \"02897867\", \"04701152\", \"07854527\", \"09989722\", \"13746191\"]}");
	add("{\"term\":\"molech\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09542589\"]}");
	add("{\"term\":\"molecule\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"14609699\", \"14706294\"]}");
	add("{\"term\":\"molehill\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09380243\"]}");
	add("{\"term\":\"moleskin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03786332\"]}");
	add("{\"term\":\"molestation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00420657\", \"00774536\"]}");
	add("{\"term\":\"molester\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10346999\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }