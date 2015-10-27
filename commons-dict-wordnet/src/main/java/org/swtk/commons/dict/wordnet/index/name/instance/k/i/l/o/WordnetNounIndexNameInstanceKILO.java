package org.swtk.commons.dict.wordnet.index.name.instance.k.i.l.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceKILO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"kilo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13746692\"]}");
	add("{\"term\":\"kilobit\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13649271\"]}");
	add("{\"term\":\"kilobyte\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13648977\", \"13649142\"]}");
	add("{\"term\":\"kilocalorie\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13748672\"]}");
	add("{\"term\":\"kilocycle\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15304776\"]}");
	add("{\"term\":\"kilogram\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13746692\"]}");
	add("{\"term\":\"kilohertz\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15304776\"]}");
	add("{\"term\":\"kiloliter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13646268\"]}");
	add("{\"term\":\"kilolitre\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13646268\"]}");
	add("{\"term\":\"kilometer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13681796\"]}");
	add("{\"term\":\"kilometre\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13681796\"]}");
	add("{\"term\":\"kiloton\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13668833\", \"13743800\"]}");
	add("{\"term\":\"kilovolt\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13665249\"]}");
	add("{\"term\":\"kilowatt\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13666240\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }