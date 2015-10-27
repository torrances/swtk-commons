package org.swtk.commons.dict.wordnet.index.name.instance.l.e.o.n;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceLEON {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"leon\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"08761524\", \"09048730\", \"09050737\"]}");
	add("{\"term\":\"leonard\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11148226\"]}");
	add("{\"term\":\"leonardo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11148384\"]}");
	add("{\"term\":\"leonberg\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02113781\"]}");
	add("{\"term\":\"leoncita\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02493738\"]}");
	add("{\"term\":\"leone\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13707321\"]}");
	add("{\"term\":\"leonidas\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11148663\"]}");
	add("{\"term\":\"leonotis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12871478\"]}");
	add("{\"term\":\"leontief\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11148824\"]}");
	add("{\"term\":\"leontocebus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02493595\"]}");
	add("{\"term\":\"leontodon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12009243\"]}");
	add("{\"term\":\"leontopodium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12009735\"]}");
	add("{\"term\":\"leonurus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12872064\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }