package org.swtk.commons.dict.wordnet.index.name.instance.b.e.n.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceBENE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"benedick\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09869398\"]}");
	add("{\"term\":\"benedict\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"09869398\", \"10863454\", \"10863997\"]}");
	add("{\"term\":\"benedictine\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07925052\", \"10132203\"]}");
	add("{\"term\":\"benediction\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07204071\", \"01045725\"]}");
	add("{\"term\":\"benefaction\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01229168\", \"13291283\"]}");
	add("{\"term\":\"benefactor\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09631739\"]}");
	add("{\"term\":\"benefactress\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09632185\"]}");
	add("{\"term\":\"benefice\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13268986\"]}");
	add("{\"term\":\"beneficence\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04847768\", \"07561203\"]}");
	add("{\"term\":\"beneficiary\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06343538\", \"09869529\"]}");
	add("{\"term\":\"beneficiation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13537515\"]}");
	add("{\"term\":\"benefit\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"06905573\", \"05149888\", \"13317922\"]}");
	add("{\"term\":\"benelux\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08322696\"]}");
	add("{\"term\":\"benet\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10864123\", \"10864263\"]}");
	add("{\"term\":\"benevolence\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"01229168\", \"04847516\", \"07561087\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }