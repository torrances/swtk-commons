package org.swtk.commons.dict.wiktionary.generated.a.i.g;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryAIG000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("aiglet", "{\"term\":\"aiglet\", \"etymology\":{\"influencers\":[{}], \"languages\":[\"English\", \"middle french (ca. 1400-1600)\"], \"text\":\"Borrowed from Middle french (ca. 1400-1600) \u0027aiguillette\u0027 (needle) diminuative of \u0027aguille\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A tip, originally of metal and often decorative, on a ribbon or cord that makes lacing two parts of a garment or garments together easier, as in corset lacings, \u0026quot;points\u0026quot; (lacing hose or trousers to jacket or doublet) or sleeves to a bodice\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"An ornament worn on clothing, consisting of a metal tag on a fringe, or a small metallic plate or spangle\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"1590\u0027\u0027, Edmund Spenser, \u0027The Faerie Queene\u0027, II.iii\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"a silken Camus [...] Which all aboue besprinckled was throughout, / With golden \u0027\u0027aygulets\u0027\u0027, that glistred bright\", \"priority\":4}]}, \"synonyms\":{}}");

	add("aigrette", "{\"term\":\"aigrette\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{borrowing|fr|aigrette||egret|lang\u003den}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The lesser white heron; the egret\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A feather or plume, or feather-shaped item, used as an adornment or ornament\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"1819\u0027\u0027, Lord Byron, \u0027Don Juan\u0027, III.77\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"His turban, furled in many a graceful fold, / An emerald \u0027\u0027aigrette\u0027\u0027, with Haidée\u0027s hair in\u0027t, / Surmounted as its clasp\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"2006\u0027\u0027, Thomas Pynchon, \u0027Against the Day\u0027, Vintage 2007, p. 181\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"Young women attired often in nothing more than ostrich-feather \u0027\u0027aigrettes\u0027\u0027 dyed in colors of doubtful taste ran nubilely up and down the marble staircases, chased by young men in razor-toed ball shoes of patent-leather\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"The feathery crown of some seeds (such as the dandelion\", \"priority\":7},{\"upperType\":\"NOUN\", \"text\":\"A plume or tuft for the head composed of feathers, or gems, etc\", \"priority\":8}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }