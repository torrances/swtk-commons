package org.swtk.commons.dict.wordnet.indexbyname.instance.s.a.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSAO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"sao bernardo do campo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08875785\"]}");
	add("{\"term\":\"sao francisco\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09446495\"]}");
	add("{\"term\":\"sao goncalo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08875937\"]}");
	add("{\"term\":\"sao joao de meriti\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08876091\"]}");
	add("{\"term\":\"sao jose dos campos\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08876252\"]}");
	add("{\"term\":\"sao louis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08876397\"]}");
	add("{\"term\":\"sao paulo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08876521\"]}");
	add("{\"term\":\"sao thome e principe\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09015018\"]}");
	add("{\"term\":\"sao thome e principe monetary unit\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13697561\"]}");
	add("{\"term\":\"sao tiago island\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08736086\"]}");
	add("{\"term\":\"sao tome\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09015407\"]}");
	add("{\"term\":\"sao tome and principe\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09015018\"]}");
	add("{\"term\":\"sao tome e principe\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09015018\"]}");
	add("{\"term\":\"saone\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09446632\"]}");
	add("{\"term\":\"saone river\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09446632\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }