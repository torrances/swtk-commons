package org.swtk.commons.dict.wordnet.index.name.instance.p.l.u.r;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePLUR {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"plural\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06306016\"]}");
	add("{\"term\":\"pluralisation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13826719\"]}");
	add("{\"term\":\"pluralism\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00413143\", \"05974616\", \"08384610\"]}");
	add("{\"term\":\"pluralist\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"10463056\", \"10463233\", \"10463404\"]}");
	add("{\"term\":\"plurality\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"13602421\", \"13797293\", \"14593425\"]}");
	add("{\"term\":\"pluralization\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13826719\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }