package org.swtk.commons.dict.wordnet.index.name.instance.s.c.l.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSCLE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"sclera\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05454794\"]}");
	add("{\"term\":\"scleranthus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11835293\"]}");
	add("{\"term\":\"scleredema\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14255942\"]}");
	add("{\"term\":\"sclerite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01906139\"]}");
	add("{\"term\":\"scleritis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14379048\"]}");
	add("{\"term\":\"scleroderma\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"12989642\", \"14588777\"]}");
	add("{\"term\":\"sclerodermataceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12989418\"]}");
	add("{\"term\":\"sclerodermatales\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12989168\"]}");
	add("{\"term\":\"sclerometer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04155350\"]}");
	add("{\"term\":\"scleropages\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02547591\"]}");
	add("{\"term\":\"scleroparei\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02644238\"]}");
	add("{\"term\":\"scleroprotein\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15051283\"]}");
	add("{\"term\":\"sclerosis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14133893\"]}");
	add("{\"term\":\"sclerotinia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12988896\"]}");
	add("{\"term\":\"sclerotiniaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12988536\"]}");
	add("{\"term\":\"sclerotium\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13043663\", \"13103589\"]}");
	add("{\"term\":\"sclerotomy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00692794\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }