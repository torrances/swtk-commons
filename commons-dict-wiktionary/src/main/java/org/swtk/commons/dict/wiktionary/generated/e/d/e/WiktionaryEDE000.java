package org.swtk.commons.dict.wiktionary.generated.e.d.e;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryEDE000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("edema", "{\"term\":\"edema\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"ancient greek (to 1453)\"], \"text\":\"From Ancient greek (to 1453) \u0027οἴδημα\u0027 (swelling) from \u0027οἰδέω\u0027 (i swell)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An excessive accumulation of serum in tissue spaces or a body cavity\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1991\u0027\u0027, Albrecht M. Ehrly, \u0027Therapeutic Hemorheology\u0027, [https://books.google.com.au/books?id\u003dOejrCAAAQBAJ\u0026amp;pg\u003dPA115\u0026amp;dq\u003d%22edemas%22\u0026amp;hl\u003den\u0026amp;sa\u003dX\u0026amp;redir_esc\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"v\u003donepage\u0026amp;q\u003d%22edemas%22\u0026amp;f\u003dfalse page 115\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"In the patients with myocardial \u0027\u0027edemas\u0027\u0027 [247, 471] it was shown that, despite a considerable loss of fluid via the kidneys after the intravenous administration of a short-acting and very effective diuretic (furosemide), there was no increase in the blood and plasma viscosities\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"2002\u0027\u0027, Peter Lanzer, \u002726: Peripheral Vascular Disease\u0027, Peter Lanzer, Eric J. Topol (editors), \u0027Pan Vascular Medicine: Integrated Clinical Management\u0027, [https://books.google.com.au/books?id\u003dB8LsCAAAQBAJ\u0026amp;pg\u003dPA389\u0026amp;dq\u003d%22edemas%22\u0026amp;hl\u003den\u0026amp;sa\u003dX\u0026amp;redir_esc\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"v\u003donepage\u0026amp;q\u003d%22edemas%22\u0026amp;f\u003dfalse page 389\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"In particular, changes in color and temperature, \u0027\u0027edemas\u0027\u0027, and ulcerations are noted. Palpation is applied as needed. In this chapter, only two skin and body surface changes will be discussed: peripheral \u0027\u0027edemas\u0027\u0027 and ulcerations\", \"priority\":7},{\"upperType\":\"NOUN\", \"text\":\"2015\u0027\u0027, Hans Scholz, \u0027Arteriovenous Access Surgery: Ensuring Adequate Vascular Access for Hemodialysis\u0027, [https://books.google.com.au/books?id\u003dN5w9BQAAQBAJ\u0026amp;pg\u003dPA185\u0026amp;dq\u003d%22edemas%22\u0026amp;hl\u003den\u0026amp;sa\u003dX\u0026amp;redir_esc\", \"priority\":8},{\"upperType\":\"NOUN\", \"text\":\"v\u003donepage\u0026amp;q\u003d%22edemas%22\u0026amp;f\u003dfalse page 185\", \"priority\":9},{\"upperType\":\"NOUN\", \"text\":\"Local lymph \u0027\u0027edemas\u0027\u0027 can often be found on the inside of a looped graft\", \"priority\":10},{\"upperType\":\"NOUN\", \"text\":\"A similar swelling in plants caused by excessive accumulation of water\", \"priority\":11}]}, \"synonyms\":{}}");

	add("edentation", "{\"term\":\"edentation\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The condition of being deprived of one or more teeth\", \"priority\":1}]}, \"synonyms\":{}}");

	add("edentulism", "{\"term\":\"edentulism\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The condition of lacking some or all teeth; toothlessness\", \"priority\":1}]}, \"synonyms\":{}}");

	add("edessa", "{\"term\":\"edessa\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"ancient greek (to 1453)\"], \"text\":\"From Ancient greek (to 1453) \u0027ἔδεσσα\u0027 ()\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A city in Greece, capital in Pella Prefecture, in periphery of Central Macedonia\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Ancient city in northwestern Mesopotamia, the capital of Osroene, on the site of modern Şanlıurfa in Turkey\", \"priority\":2}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }