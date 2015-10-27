package org.swtk.commons.dict.wordnet.index.name.instance.v.o.l.u;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceVOLU {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"volubility\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04658552\"]}");
	add("{\"term\":\"volume\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"04997456\", \"13801456\", \"06425309\", \"02873453\", \"05106651\", \"13801244\"]}");
	add("{\"term\":\"volumeter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04548761\"]}");
	add("{\"term\":\"voluminosity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05113324\"]}");
	add("{\"term\":\"voluminousness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05113324\"]}");
	add("{\"term\":\"volund\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09607734\"]}");
	add("{\"term\":\"voluntary\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07054871\", \"10778999\"]}");
	add("{\"term\":\"volunteer\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"09765063\", \"10778819\", \"10778999\"]}");
	add("{\"term\":\"voluptuary\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10779211\"]}");
	add("{\"term\":\"voluptuousness\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04694097\", \"05123543\", \"05218088\"]}");
	add("{\"term\":\"volute\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03069428\", \"04286804\"]}");
	add("{\"term\":\"volution\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07461777\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }