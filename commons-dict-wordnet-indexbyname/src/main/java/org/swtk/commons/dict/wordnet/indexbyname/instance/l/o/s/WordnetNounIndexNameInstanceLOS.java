package org.swtk.commons.dict.wordnet.indexbyname.instance.l.o.s;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceLOS {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"los alamos\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09138670\"]}");
	add("{\"term\":\"los angeles\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09086143\"]}");
	add("{\"term\":\"loser\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"10292479\", \"10292761\", \"10292610\"]}");
	add("{\"term\":\"losing streak\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08477780\"]}");
	add("{\"term\":\"losings\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13350344\"]}");
	add("{\"term\":\"loss\", \"synsetCount\":8, \"upperType\":\"NOUN\", \"ids\":[\"07348249\", \"07355325\", \"13348253\", \"07302177\", \"05170512\", \"00068346\", \"13530399\", \"13348698\"]}");
	add("{\"term\":\"loss leader\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03239498\"]}");
	add("{\"term\":\"loss of consciousness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07493309\"]}");
	add("{\"term\":\"loss ratio\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13844947\"]}");
	add("{\"term\":\"losses\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13350344\"]}");
	add("{\"term\":\"lost\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07963280\"]}");
	add("{\"term\":\"lost cause\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00802486\"]}");
	add("{\"term\":\"lost tribes\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08389982\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }