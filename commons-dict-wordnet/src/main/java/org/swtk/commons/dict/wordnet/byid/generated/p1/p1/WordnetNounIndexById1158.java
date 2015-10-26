package org.swtk.commons.dict.wordnet.byid.generated.p1.p1;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexById1158 {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("11581679", "{\"term\":\"liliid monocot genus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11581679\"]}");
	add("11583198", "{\"term\":\"dicot family\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11583198\"]}");
	add("11583198", "{\"term\":\"magnoliopsid family\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11583198\"]}");
	add("11584709", "{\"term\":\"magnoliid dicot family\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11584709\"]}");
	add("11585185", "{\"term\":\"hamamelid dicot family\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11585185\"]}");
	add("11585491", "{\"term\":\"caryophylloid dicot family\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11585491\"]}");
	add("11585836", "{\"term\":\"dilleniid dicot family\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11585836\"]}");
	add("11586681", "{\"term\":\"asterid dicot family\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11586681\"]}");
	add("11587133", "{\"term\":\"rosid dicot family\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11587133\"]}");
	add("11587862", "{\"term\":\"dicot genus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11587862\"]}");
	add("11587862", "{\"term\":\"magnoliopsid genus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11587862\"]}");
 	}  	private static void add(final String ID, final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(ID)) ? map.get(ID) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(ID, list); 	} 	 	public static Collection<IndexNoun> get(final String ID) { 		return map.get(ID); 	}  	public boolean has(final String ID) { 		return map.containsKey(ID); 	} }