package org.swtk.commons.dict.wordnet.index.name.instance.t.r.i.n;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTRIN {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"trine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13766184\"]}");
	add("{\"term\":\"trinectes\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02667749\"]}");
	add("{\"term\":\"tringa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02030384\"]}");
	add("{\"term\":\"trinidad\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08773685\"]}");
	add("{\"term\":\"trinidadian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10749363\"]}");
	add("{\"term\":\"trinitarian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10758444\"]}");
	add("{\"term\":\"trinitarianism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06240621\"]}");
	add("{\"term\":\"trinitroglycerin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14910730\"]}");
	add("{\"term\":\"trinitrotoluene\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04449277\"]}");
	add("{\"term\":\"trinity\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"08002508\", \"09559900\", \"13766184\"]}");
	add("{\"term\":\"trinket\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02790458\"]}");
	add("{\"term\":\"trinketry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08481335\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }