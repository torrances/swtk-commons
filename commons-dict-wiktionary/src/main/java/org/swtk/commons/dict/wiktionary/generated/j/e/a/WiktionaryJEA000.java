package org.swtk.commons.dict.wiktionary.generated.j.e.a;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryJEA000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("jealousy", "{\"term\":\"jealousy\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"old french (842-ca. 1400)\"], \"text\":\"Old french (842-ca. 1400) \u0027jalousie\u0027 see \u0027jealous\u0027 \u0027-y\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A state of suspicious guarding towards a spouse, lover etc., from fears of infidelity\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A resentment towards someone for a perceived advantage or superiority they hold\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"1907\u0027\u0027, Charles J. Archard, \u0027The Portland Peerage Romance\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"Jealousy\u0027\u0027 was, however, aroused among the English nobility at the favouritism shown the Dutch newcomer\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"Envy towards another\u0027s possession\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"1891\u0027\u0027, Louis Antoine Fauvelet De Bourrienne, translated by R. W. Phipps, \u0027Memoirs Of Napoleon Bonaparte\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"the \u0027\u0027jealousy\u0027\u0027 of his foes of each other\u0027s share in the booty\", \"priority\":7},{\"upperType\":\"NOUN\", \"text\":\"A close concern for someone or something, solicitude, vigilance\", \"priority\":8},{\"upperType\":\"NOUN\", \"text\":\"For euer I supoosed that he had ben to yonge and to tendyr to take vpon hym these aduentures / And therfore by my wille I wold haue dryuen hym aweye for \u0027\u0027Ialousy\u0027\u0027 that I had of his lyf / for it maye be no yong knyghtes dede that shal enchyeue this aduenture to the ende\u0026lt;!--Prior quote\", \"priority\":9},{\"upperType\":\"NOUN\", \"text\":\"And therefore by my wyll I wolde have dryvyn hym away for \u0027\u0027jelosy\u0027\u0027 that I had of hys lyff--\u0026gt\", \"priority\":10}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }