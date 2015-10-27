package org.swtk.commons.dict.wordnet.index.name.instance.m.a.m.m;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceMAMM {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"mamma\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05561822\", \"10297825\"]}");
	add("{\"term\":\"mammal\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01864419\"]}");
	add("{\"term\":\"mammalia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01864106\"]}");
	add("{\"term\":\"mammalian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01864419\"]}");
	add("{\"term\":\"mammalogist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10306686\"]}");
	add("{\"term\":\"mammalogy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06082765\"]}");
	add("{\"term\":\"mammea\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12390528\"]}");
	add("{\"term\":\"mammee\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"07780462\", \"07782506\", \"12390691\", \"12796679\"]}");
	add("{\"term\":\"mammilla\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05562286\"]}");
	add("{\"term\":\"mammillaria\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11870340\"]}");
	add("{\"term\":\"mammogram\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03721767\"]}");
	add("{\"term\":\"mammography\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01008130\"]}");
	add("{\"term\":\"mammon\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09514455\", \"14516218\"]}");
	add("{\"term\":\"mammoth\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02507401\"]}");
	add("{\"term\":\"mammothermography\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01008478\"]}");
	add("{\"term\":\"mammut\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02508440\"]}");
	add("{\"term\":\"mammuthus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02507266\"]}");
	add("{\"term\":\"mammutidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02508277\"]}");
	add("{\"term\":\"mammy\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10297825\", \"10306779\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }