package org.swtk.commons.dict.wiktionary.generated.l.y.d;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryLYD000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("lydia", "{\"term\":\"lydia\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"ancient greek (to 1453)\"], \"text\":\"From Ancient greek (to 1453) \u0027λυδία\u0027 (the region of lydia) The region of Lydia is said to be named for a king \u0027λυδός\u0027 (Lydus); the given name Lydia originally indicated ancestry or residence in the region of Lydia.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A historic region of SW Asia Minor/Persia\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A woman converted by Paul; presumably named for ancestry or residence in Lydia\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"And a certain woman named \u0027\u0027Lydia\u0027\u0027, a seller of purple, of the city of Thyatira, which worshipped God, heard us: whose heart the Lord opened, that she attended unto the things which were spoken of Paul\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"1813\u0027\u0027 , s:Pride and Prejudice/Chapter Pride and Prejudice/Chapter 9\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"Lydia\u0027\u0027 was a stout, well-grown girl of fifteen, with a fine complexion and good-humoured countenance; a favourite with her mother, whose affection had brought her into public at an early age\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"1990\u0027\u0027 , \u0027Family Pictures\u0027, Harper \u0026amp; Row, ISBN 0060163976, page 5\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"The first three, Macklin, \u0027\u0027Lydia\u0027\u0027, and Randall, were the special ones. Even those names, we thought, showed greater imagination, greater involvement on our parents\u0027 part, than ours did: Nina, Mary, Sarah\", \"priority\":7}]}, \"synonyms\":{}}");

	add("lydian", "{\"term\":\"lydian\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From {{suffix|Lydia|an|lang\u003den}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A native or inhabitant of ancient Lydia\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }