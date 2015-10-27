package org.swtk.commons.dict.wordnet.index.name.instance.q.u.i.c;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceQUIC {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"quiche\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"06938797\", \"07635203\", \"09686802\"]}");
	add("{\"term\":\"quick\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05605735\"]}");
	add("{\"term\":\"quickener\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09425579\"]}");
	add("{\"term\":\"quickening\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00331283\", \"14071616\", \"13565986\"]}");
	add("{\"term\":\"quickie\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00269301\"]}");
	add("{\"term\":\"quicklime\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14814055\"]}");
	add("{\"term\":\"quickness\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"05066283\", \"05627128\", \"05650020\"]}");
	add("{\"term\":\"quicksand\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09425819\", \"14435176\"]}");
	add("{\"term\":\"quickset\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13148425\"]}");
	add("{\"term\":\"quicksilver\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14669524\"]}");
	add("{\"term\":\"quickstep\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00538001\", \"07072708\"]}");
	add("{\"term\":\"quicky\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00269301\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }