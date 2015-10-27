package org.swtk.commons.dict.wordnet.index.name.instance.i.m.m.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceIMMO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"immobilisation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01148801\", \"01262989\"]}");
	add("{\"term\":\"immobility\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04783538\", \"14029975\"]}");
	add("{\"term\":\"immobilization\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01148801\", \"01262989\"]}");
	add("{\"term\":\"immobilizing\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01148801\"]}");
	add("{\"term\":\"immoderateness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05125551\"]}");
	add("{\"term\":\"immoderation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05125551\"]}");
	add("{\"term\":\"immodesty\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00739192\", \"04910313\"]}");
	add("{\"term\":\"immolation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00228836\"]}");
	add("{\"term\":\"immorality\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00746935\", \"04857820\"]}");
	add("{\"term\":\"immortal\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09528550\", \"10219263\"]}");
	add("{\"term\":\"immortality\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"15169054\", \"05063253\"]}");
	add("{\"term\":\"immortelle\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12054178\"]}");
	add("{\"term\":\"immotility\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04783692\"]}");
	add("{\"term\":\"immovability\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04783938\"]}");
	add("{\"term\":\"immovable\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13267374\"]}");
	add("{\"term\":\"immovableness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04783938\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }