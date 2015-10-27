package org.swtk.commons.dict.wordnet.index.name.instance.d.e.f.l;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceDEFL {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"deflagration\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13471590\"]}");
	add("{\"term\":\"deflation\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00362758\", \"13481024\", \"13520368\"]}");
	add("{\"term\":\"deflator\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13278691\"]}");
	add("{\"term\":\"deflection\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"00351206\", \"05018461\", \"07325457\", \"07425483\", \"14528328\"]}");
	add("{\"term\":\"deflector\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03176704\"]}");
	add("{\"term\":\"deflexion\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"00351206\", \"05018461\", \"07325457\", \"07425483\"]}");
	add("{\"term\":\"defloration\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00846655\", \"00968822\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }