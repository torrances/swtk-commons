package org.swtk.commons.dict.wordnet.index.name.instance.d.e.f.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceDEFI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"defiance\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"01172810\", \"07246603\", \"04915168\"]}");
	add("{\"term\":\"defibrillation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00700212\"]}");
	add("{\"term\":\"defibrillator\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03176301\"]}");
	add("{\"term\":\"deficiency\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05120433\", \"14472871\"]}");
	add("{\"term\":\"deficit\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"13417449\", \"13616793\", \"14473426\", \"05121671\"]}");
	add("{\"term\":\"defilade\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03176576\"]}");
	add("{\"term\":\"defile\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09286818\"]}");
	add("{\"term\":\"defilement\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14521988\"]}");
	add("{\"term\":\"defiler\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10471414\"]}");
	add("{\"term\":\"defining\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13576649\"]}");
	add("{\"term\":\"definiteness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04761492\"]}");
	add("{\"term\":\"definition\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04710305\", \"06757091\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }